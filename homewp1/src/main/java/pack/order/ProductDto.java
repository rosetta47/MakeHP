package pack.order;

public class ProductDto {
	private int product_num,product_price,product_count;
	private String product_name,product__contents,product_date,product_category;
	
	public ProductDto(String product_name,int product_price) {
		this.product_name=product_name;
		this.product_price=product_price;
	}
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct__contents() {
		return product__contents;
	}
	public void setProduct__contents(String product__contents) {
		this.product__contents = product__contents;
	}
	public String getProduct_date() {
		return product_date;
	}
	public void setProduct_date(String product_date) {
		this.product_date = product_date;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

}
