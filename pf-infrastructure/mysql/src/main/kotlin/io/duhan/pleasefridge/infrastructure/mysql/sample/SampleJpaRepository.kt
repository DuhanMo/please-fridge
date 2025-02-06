package io.duhan.pleasefridge.infrastructure.mysql.sample

import org.springframework.data.jpa.repository.JpaRepository

interface SampleJpaRepository : JpaRepository<SampleEntity, Long>
