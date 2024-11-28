package com.sample.springboot_boilerplate.Db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthHandler {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<Object[]> authUser(String empEmail, String password) {
        StringBuilder query = new StringBuilder();
        query.append("select * from t_user where emp_email = :empEmail and password = :password ");

        Query nativeQuery = entityManager.createNativeQuery(query.toString());
        nativeQuery.setParameter("empEmail", empEmail);
        nativeQuery.setParameter("password", password);
        return nativeQuery.getResultList();
    }

}
