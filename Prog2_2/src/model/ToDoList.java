package model;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<ToDoItem> itemList = new ArrayList<>();

    public void addItem(ToDoItem item) {
        itemList.add(item);
    }
    public ToDoItem getItemByIndex(int index ){
        return itemList.get(index);
    }
    public int getItemCount(){
        return itemList.size();
    }
    public void setChangeState(int index){
        ToDoItem item = itemList.get(index);
        item.setComplete(!item.isComplete());
    }
}
