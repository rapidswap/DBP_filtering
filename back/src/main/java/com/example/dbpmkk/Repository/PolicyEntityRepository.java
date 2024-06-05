package com.example.dbpmkk.Repository;

import com.example.dbpmkk.Domain.PolicyEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PolicyEntityRepository extends JpaRepository<PolicyEntity, Integer> {
    List<PolicyEntity> findByBusinessSupportOrganizationName(String businessSupportOrganizationName);

    @Query(value = "SELECT * FROM support WHERE Business_support_organization_name = :organization AND CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByOrganizationAndBudgetRange(
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByBudgetRange(
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);
}

