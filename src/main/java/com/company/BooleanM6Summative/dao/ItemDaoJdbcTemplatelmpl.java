package com.company.BooleanM6Summative.dao;

import com.company.BooleanM6Summative.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemDaoJdbcTemplatelmpl implements ItemDao {
    private static final String INSERT_ITEM_SQL =
            "insert into item (name, description, daily_rate) values (?,?,?)";
    private static final String SELECT_ITEM_SQL =
            "select * from item where item_id = ?";
    private static final String SELECT_ALLITEMS_SQL =
            "select * from item";
    private static final String DELETE_ITEM_SQL =
            "delete from item where item_id = ?";
    private static final String UPDATE_ITEM_SQL =
            "update item set name = ?, description = ?, daily_rate = ? where item_id = ?";
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ItemDaoJdbcTemplatelmpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Item getItem(int id) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Item addItem(Item item) {
        return null;
    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public void deleteItem(int id) {

    }

    private Item mapRowToItem(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item();
        item.setName(rs.getString("name"));
        item.setDescription(rs.getString("This is a description"));
        item.setDailyRate(5.43);
        return item;
    }
}
