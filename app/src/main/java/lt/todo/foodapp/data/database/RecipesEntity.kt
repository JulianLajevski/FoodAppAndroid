package lt.todo.foodapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import lt.todo.foodapp.models.FoodRecipe
import lt.todo.foodapp.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
){
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}