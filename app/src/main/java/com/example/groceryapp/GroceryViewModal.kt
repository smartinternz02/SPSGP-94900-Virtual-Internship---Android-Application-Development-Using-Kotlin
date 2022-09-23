package com.example.groceryapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModal(private val repositry: GroceryRepositry):ViewModel() {
    fun insert(items: GroceryItems)=GlobalScope.launch {
        repositry.insert(items)
    }
    fun delete(items: GroceryItems)=GlobalScope.launch {
        repositry.delete(items)
    }
    fun getAllGroceryItems()=repositry.getAllItems()

}