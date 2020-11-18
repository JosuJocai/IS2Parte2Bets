package bean;

import java.util.Date;
import java.util.Vector;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import domain.Event;
import gui.ApplicationLauncher;

import org.primefaces.event.SelectEvent;

public class CreateBean {
	private Date date;
	private Vector<Event> events;
	
	public CreateBean () {
		
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void onDateSelect(SelectEvent event) {
//		Object o = event.getObject();
//		if (o instanceof Date) {
//			date = (Date) o;
//			events = blFacade.getEvents(date);
//			for (Event e : events) {
//				System.out.println(e.getDescription());
//			}
//		}else {
//			System.err.println("No devuelve un tipo Date.");
//		}
	}
}
