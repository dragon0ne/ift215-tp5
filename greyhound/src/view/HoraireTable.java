package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.Point;
import model.Trajet;

public class HoraireTable extends JTable
{
	public HoraireTable(List<Trajet> trajets, boolean we, String destination) {
		String[] columnNames = { "Heure de départ", "Heure d'arrivée", "Durée" };

		List<Object[]> content = new ArrayList<Object[]>();

		for (Trajet traj : trajets)
		{
			if (!traj.isEst_weekend() == we)
				continue;

			//TODO ne prend que les trajets si le départ est la première ville du trajet
			// Getting the initial and destination town
			Point initialTown = traj.getTrajet().get(0);
			Point destinationTown = traj.getTrajet().get(1);
			
			if (!destinationTown.getVille().equals(destination))
				continue;

			Object[] line = new Object[3];
			line[0] = initialTown.getHeure();
			line[1] = destinationTown.getHeure();
			line[2] = traj.getDure(destinationTown);
			
			content.add(line);

		}
		
		Object[][] datas = new Object[content.size()][];
		
		for(int i=0; i<content.size(); i++)
		{
			datas[i] = content.get(i);
		}
		
		this.setModel(new DefaultTableModel(datas, columnNames));

		TableRowSorter<TableModel> sorter 
	    = new TableRowSorter<TableModel>(this.getModel());
		this.setRowSorter(sorter);
		
	}
}
