package gui;

import model.ToDoItem;
import model.ToDoList;

import javax.swing.table.AbstractTableModel;

public class TodoTableModel extends AbstractTableModel {
    private ToDoList toDoList;

    public void setList(ToDoList toDoList){
        this.toDoList = toDoList;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return toDoList.getItemCount();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ToDoItem item = toDoList.getItemByIndex(rowIndex);
        switch (columnIndex){
            case 0:
                return item.getTitle();

            case 1:
                return item.isComplete();

            case 2:
                return item.getDateTime();
            default:
                return "?";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        ToDoItem item = toDoList.getItemByIndex(rowIndex);
        switch (columnIndex) {
            case 0:
                item.setTitle((String) aValue);
                break;
            case 1:
                item.setComplete((Boolean) aValue);
                break;
            default:
                break;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "nazev";
            case 1:
                return "Dokonceno?";
            case 2:
                return "Datum a cas dokonceni";
                default:
                    return "?";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return Boolean.class;
            case 2:
                return String.class;
            default:
                return Object.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
