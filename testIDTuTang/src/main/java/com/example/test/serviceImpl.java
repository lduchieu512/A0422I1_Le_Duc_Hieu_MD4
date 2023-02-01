package com.example.test;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

@Service
public class serviceImpl implements IService, IdentifierGenerator {
    @Autowired
    private repo repo;
    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public void create(Employee employee) {

        repo.save(employee);
    }
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
