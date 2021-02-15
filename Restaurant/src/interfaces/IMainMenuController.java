package interfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;

import models.Client;
import models.Order;

public interface IMainMenuController {
	public boolean newOrder(Client c, LocalDateTime id);

	public boolean changeOrder(Client c);

	public boolean changeOrder(LocalDateTime d);

	public boolean changeOrder(Client c, LocalDateTime d);

	public boolean deleteOrder(Client c);

	public boolean deleteOrder(LocalDateTime d);

	public boolean deleteOrder(Client c, LocalDateTime d);

	public double cashToDay();

	public double cashThisMonth();

	public double cashTotal();

	public ArrayList<Order> viewOrdersNotPayed();

	public ArrayList<Order> viewOrdersPendingDelivered();

	public void saveAllAndClose();
}