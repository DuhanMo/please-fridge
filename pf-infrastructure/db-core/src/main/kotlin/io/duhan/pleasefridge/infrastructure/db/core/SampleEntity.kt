package io.duhan.pleasefridge.infrastructure.db.core

import io.duhan.pleasefridge.domain.Sample
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class SampleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
) {
    fun toModel(): Sample {
        return Sample(id, name)
    }
}
