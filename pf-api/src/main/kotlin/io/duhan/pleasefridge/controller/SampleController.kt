package io.duhan.pleasefridge.controller

import io.duhan.pleasefridge.application.service.SampleService
import io.duhan.pleasefridge.domain.Sample
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService,
) {
    @GetMapping
    fun sample(): List<Sample> {
        return sampleService.sample()
    }
}
