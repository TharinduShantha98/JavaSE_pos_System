package bo.custom;

import entitiy.Item;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {

    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean addItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    ItemDTO searchItem(String itemCode) throws SQLException, ClassNotFoundException;


}
