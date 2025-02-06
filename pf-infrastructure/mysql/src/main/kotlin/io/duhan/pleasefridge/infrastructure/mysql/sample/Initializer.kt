package io.duhan.pleasefridge.infrastructure.mysql.sample

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Initializer(
    private val sampleJpaRepository: SampleJpaRepository,
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        (1..10).forEach {
            sampleJpaRepository.save(SampleEntity(name = "$it 번째 샘플"))
        }
    }
}
