package com.sample.springboot_boilerplate.Db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrgHandler {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<Object[]> listAllOrgs() {
        StringBuilder query = new StringBuilder();
        query.append("select * from t_organization ");

        Query nativeQuery = entityManager.createNativeQuery(query.toString());
        return nativeQuery.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Object[]> getProductList(Integer id) {
        StringBuilder query = new StringBuilder();
        query.append("select id, product_name from t_product where org_id = :id ");

        Query nativeQuery = entityManager.createNativeQuery(query.toString());
        return nativeQuery.setParameter("id", id).getResultList();
    }
}

