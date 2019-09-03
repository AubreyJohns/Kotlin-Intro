package BuildingsGenerics

open class BaseBuildingMaterial(var numberNeeded: Int = 1){

}
class Wood: BaseBuildingMaterial( 4){

}
class Brick: BaseBuildingMaterial( 8){

}
class Building<T: BaseBuildingMaterial>(var baseBuildingMaterial: T){
    var baseMaterialsNeeded: Int = 100
    var actualMaterialsNeeded: Int = baseMaterialsNeeded*baseBuildingMaterial.numberNeeded
    fun build(){
        println("Type of material: ${baseBuildingMaterial::class.simpleName} \nNumber of materials needed: $actualMaterialsNeeded")
    }
}

fun main(){
    var building = Building(Wood())
    building.build()
}