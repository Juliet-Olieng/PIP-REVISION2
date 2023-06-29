fun main(args: Array<String>) {


//    two
    var moroccanRecipe = MoroccanRecipe(listOf(Ingredient("chicken"),Ingredient("greenolives")), "1hour", "boiling", "carbohydrates")
    println(moroccanRecipe.displayDishes("Tagine"))
    var ethiopianRecipe = EthiopianRecipe(listOf(Ingredient("barley"),Ingredient("teff_flour")), "20mins", "baking", "carbohydrates")
    println(ethiopianRecipe.displayDishes("injera"))
    var nigerianRecipe = NigerianRecipe(listOf(Ingredient("rice"),Ingredient("meat")), "20mins", "baking", "carbohydrates")
    println(nigerianRecipe.displayDishes("jollof"))

//    three

    var predator=Species.Predator("meat",100,"food","carnivores")
    println(predator.hungerLevel(5))
    var prey=Species.Prey("vegetables",20,"pasture","herbivous")
    println(prey.isSafe(6))
}

//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
data class  Ingredient(val name:String)
open class Recipe(var ingredients:List<Ingredient>,var preparationTime:String,var cookingMethod:String,var nutrients:String) {
    fun displayDishes(food:String):String{
        return "$food is prepared using $ingredients ,it takes $preparationTime,how to prepare it $cookingMethod and it provides you with $nutrients nutrients "

    }
}
class MoroccanRecipe(ingredients:List<Ingredient>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){

}
class EthiopianRecipe(ingredients: List<Ingredient>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){
    fun detectAlergies(allergy:String):String{
        if (allergy in ingredients){
            return "do not eat"
        }
        else{
            return "eat"
        }
    }

}
class NigerianRecipe(ingredients: List<Ingredient>,preparationTime: String,cookingMethod: String,nutrients: String):Recipe(ingredients,preparationTime,cookingMethod,nutrients){
    fun simillarIngridient(){
        if ()
    }

}
//3. **Wildlife Preservation:** You're a wildlife conservationist working on a
//program to track different species in a national park. Each species has its own
//characteristics and behaviors, such as its diet, typical lifespan, migration
//patterns, etc. Some species might be predators, others prey. You'll need to
//create classes to model `Species`, `Predator`, `Prey`, etc., and think about how
//these classes might relate to each other through inheritance.
open class Species (var diet:String,var lifeSpan:Int,var migrations:String,var pattern:String){


    class Predator(diet: String,lifeSpan: Int,migrations: String,pattern: String):Species(diet, lifeSpan, migrations, pattern){
        fun hungerLevel(hunger_level:Int):String{
            if (hunger_level > 7){
                return "the predator is hungry "
            }
            else{
                return "the predator is not hungry"
            }
        }

    }
    class Prey(diet: String,lifeSpan: Int,migrations: String,pattern: String):Species(diet, lifeSpan, migrations, pattern){
        fun isSafe(predactorDistance:Int):String{
            if (predactorDistance<2){
                return "prey not safe"
            }
            else{
                return "prey is safe"
            }
        }

    }
}