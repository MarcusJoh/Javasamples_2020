package parseCSV;

public class CSVobject {

	private String OrderDate;
	private String Region;
	private String Rep1;
	private String Rep2;
	private String Item;
	private String Units;
	private String UnitCost;
	private String Total;

	public CSVobject( String OrderDate, String Region, String Rep1, String Rep2, String Item, String Units,
			String UnitCost, String Total) {

	
		this.OrderDate = OrderDate;
		this.Region = Region;
		this.Rep1 = Rep1;
		this.Rep2 = Rep2;
		this.Item = Item;
		this.Units = Units;
		this.UnitCost = UnitCost;
		this.Total = Total;

	}


	public String getOrderDate() {
		return OrderDate;
	}

	public String getRegion() {
		return Region;
	}

	public String getRep1() {
		return Rep1;
	}

	public String getRep2() {
		return Rep2;
	}

	public String getItem() {
		return Item;
	}

	public String getUnits() {
		return Units;
	}

	public String getUnitCost() {
		return UnitCost;
	}

	public String getTotal() {
		return Total;
	}

	public void printAll() {

	
		System.out.print(this.OrderDate);
		System.out.print(",");
		System.out.print(this.Region);
		System.out.print(",");
		System.out.print(this.Rep1);
		System.out.print(",");
		System.out.print(this.Rep2);
		System.out.print(",");
		System.out.print(this.Item);
		System.out.print(",");
		System.out.print(this.Units);
		System.out.print(",");
		System.out.print(this.UnitCost);
		System.out.print(",");
		System.out.println(this.Total);
	}

}
