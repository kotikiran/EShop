package com.eshop.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eshop.bean.Catogery;
import com.eshop.bean.ProductBean;
import com.eshop.util.DBCon;

public class ProductDao {
	ProductBean bean;
	Connection con;

	public List<ProductBean> getProduct(int id) throws SQLException {
		con = DBCon.getCon();
		PreparedStatement ps = con
				.prepareStatement("select * from products_table where Category_Table_Category_ID="
						+ id + "");

		ResultSet rs = ps.executeQuery();
		List<ProductBean> list = new ArrayList<ProductBean>();

		while (rs.next()) {
			bean = new ProductBean();
			bean.setProductId(rs.getInt("Product_id"));
			bean.setProductName(rs.getString("Products_Name").trim());
			bean.setDescription(rs.getString("Description"));
			bean.setQuantity(rs.getInt("Quantity"));
			bean.setPrice(rs.getDouble("Price"));
			list.add(bean);
		}
		return list;
	}

	public void setCatogery(Catogery cat) throws SQLException {
		PreparedStatement ps = DBCon.getCon().prepareStatement(
				"insert into category_table values(?,?,?,?)");
		ps.setInt(0, cat.getCatId());
		ps.setString(1, cat.getCatName());
		ps.setString(2, cat.getDescription());
		ps.setDate(3, cat.getDate());
		ResultSet rs = ps.executeQuery();
	}
}
