/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author AxlHrndz
 */
public class TarjetaTableModel extends AbstractTableModel{ 
    public List<DetalleTarjetaDeTiempo> detalle = new ArrayList<DetalleTarjetaDeTiempo>();
    
    @Override
    public int getRowCount() {
        return detalle.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetalleTarjetaDeTiempo det = detalle.get(rowIndex);
        Object valor = null;

        switch (columnIndex) {
            case 0:
                valor = det.getDiaDeTrabajo();
                break;
            case 1:
                valor = det.getEmpleado().getNombreCompleto();
                break;
            case 2:
                valor = det.getHorasTrabajadas();
                break;
            case 3:
                valor = det.getHorasExtras();
                break;
            case 4:
                valor = det.getHorasTrabajadas()*det.getHorasExtras();
        }
        return valor;
    }
    
     public void add(DetalleTarjetaDeTiempo a){
     detalle.add(a);
 }
}
