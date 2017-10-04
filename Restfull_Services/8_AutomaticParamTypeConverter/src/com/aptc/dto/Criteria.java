package com.aptc.dto;

public class Criteria {
	protected String category;
	protected String product;
	
	/*public Criteria(String keyword) {
       String[] splits = null;
       
       splits = keyword.split(",");
       if(splits!=null && splits.length==2){
    	   category=splits[0];
    	   product=splits[1];
       }else if (splits!=null && splits.length==1) {
    	   category=splits[0];
       }
	}*/
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public static Criteria valueOf(String keyword){
		String[] splits = null;
		Criteria criteria = null;
		
		criteria = new Criteria();
		splits = keyword.split(",");
		if(splits!=null && splits.length==2){
			criteria.category = splits[0];
			criteria.product = splits[1];
		}else if (splits!=null && splits.length==2) {
			criteria.category = splits[0];
		}
		return criteria;
	}
	@Override
	public String toString() {
		return "Criteria[category="+category+", Product="+product+"]";
	}
}
