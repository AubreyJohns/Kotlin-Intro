package buildingsGenerics

open class BaseBuildingMaterial(var numberNeeded: Int = 1){}

class Wood: BaseBuildingMaterial( 4){}

class Brick: BaseBuildingMaterial( 8){}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>){
    if (building.actualMaterialsNeeded<500) println("Small building") else println("Large building")
}

class Building<out T: BaseBuildingMaterial>(val baseBuildingMaterial: T){
    var baseMaterialsNeeded: Int = 100
    var actualMaterialsNeeded: Int = baseMaterialsNeeded*baseBuildingMaterial.numberNeeded
    fun build(){
        println("Type of material: ${baseBuildingMaterial::class.simpleName} \nNumber of materials needed: $actualMaterialsNeeded")
    }
}

fun main(){
    Building(Wood()).build()
    Building(Brick()).build()
    isSmallBuilding(Building(Wood()))
    isSmallBuilding(Building(Brick()))
}