package lt.todo.foodapp.data

import kotlinx.coroutines.flow.Flow
import lt.todo.foodapp.data.database.RecipesDao
import lt.todo.foodapp.data.database.RecipesEntity

import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {

    fun readDatabase(): Flow<List<RecipesEntity>>{
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity){
        recipesDao.insertRecipes(recipesEntity)
    }

}