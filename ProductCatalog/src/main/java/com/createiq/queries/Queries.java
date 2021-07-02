package com.createiq.queries;

public interface Queries {
public static String insert="insert into product values(?,?,?)";
public static String update="update product set pName=?"
		+ "where pId=?";
public static String list="select * from product";
public static String find_by_id="select * from product where pId=?";
public static String delete_by_id="delete from product where pId=?";
}
