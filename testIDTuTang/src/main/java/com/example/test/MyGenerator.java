package com.example.test;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import javax.persistence.*;

public class MyGenerator implements IdentifierGenerator {


    private String prefix = "EMP";
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object)
            throws HibernateException {
        String query = "SELECT e.id FROM Employee e";
        Stream<String> ids = session.createQuery(query, String.class).stream();
        Long max = ids.map(o -> o.replace(prefix, "")).mapToLong(Long::parseLong).max().orElse(0L);
        return prefix + (String.format("%04d", max + 1));
    }




}

