package com.company.BooleanM6Summative.dao;

import com.company.BooleanM6Summative.model.Item;

import java.util.List;

public interface ItemDao {
    Item getItem(int id);

    List<Item> getAllItems();

    Item addItem(Item item);

    void updateItem(Item item);

    void deleteItem(int id);
}
