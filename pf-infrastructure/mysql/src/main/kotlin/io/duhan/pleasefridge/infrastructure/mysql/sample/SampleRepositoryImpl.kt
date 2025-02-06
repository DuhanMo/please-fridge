package io.duhan.pleasefridge.infrastructure.mysql.sample

import io.duhan.pleasefridge.application.port.SampleRepository
import io.duhan.pleasefridge.domain.Sample
import org.springframework.stereotype.Repository

@Repository
class SampleRepositoryImpl(
    private val sampleJpaRepository: SampleJpaRepository,
) : SampleRepository {
    override fun findAll(): List<Sample> {
        return sampleJpaRepository.findAll().map { it.toModel() }
    }
}
