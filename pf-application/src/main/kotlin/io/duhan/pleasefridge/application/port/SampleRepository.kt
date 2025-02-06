package io.duhan.pleasefridge.application.port

import io.duhan.pleasefridge.domain.Sample

interface SampleRepository {
    fun findAll(): List<Sample>
}
