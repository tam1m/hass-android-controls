package com.example.hasscontrolsprovider.entity

data class HassVacuum(
    override val entityId: String,
    override val isAvailable: Boolean,
    override val name: String,
    override val status: String,
    val features: Set<VacuumFeatures>,
    val batteryPercent: Int?
) : HassControl

enum class VacuumFeatures {
    BATTERY_PERCENT
}