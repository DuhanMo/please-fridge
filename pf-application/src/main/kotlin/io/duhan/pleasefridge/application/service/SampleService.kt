package io.duhan.pleasefridge.application.service

import io.duhan.pleasefridge.application.port.SampleRepository
import io.duhan.pleasefridge.domain.Sample
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SampleService(
    private val sampleRepository: SampleRepository,
) {
    @Transactional
    fun sample(): List<Sample> {
        return sampleRepository.findAll()
    }
}
