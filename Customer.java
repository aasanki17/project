package com.app.pojos;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer 
{
	private Integer cust_id;
	private Integer reg_id;
	private CattleType cattle_type;
	private double quantity;
	private Date date;
	
	public Customer()
	{		}

	public Customer(CattleType cattle_type, double quantity, Date date) {
		super();
		this.cattle_type = cattle_type;
		this.quantity = quantity;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	
	
	@JoinColumn
	public Integer getReg_id() {
		return reg_id;
	}

	public void setReg_id(Integer reg_id) {
		this.reg_id = reg_id;
	}

	@Enumerated(EnumType.STRING)
	public CattleType getCattle_type() {
		return cattle_type;
	}

	public void setCattle_type(CattleType cattle_type) {
		this.cattle_type = cattle_type;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", reg_id=" + reg_id + ", cattle_type=" + cattle_type + ", quantity="
				+ quantity + ", date=" + date + "]";
	}

}
