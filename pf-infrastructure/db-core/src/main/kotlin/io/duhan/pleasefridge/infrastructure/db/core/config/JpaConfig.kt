package io.duhan.pleasefridge.infrastructure.db.core.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["io.duhan.pleasefridge.infrastructure.db.core"])
@EnableJpaRepositories(basePackages = ["io.duhan.pleasefridge.infrastructure.db.core"])
class JpaConfig
