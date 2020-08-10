package com.dao;

import java.util.List;

import com.pojo.Flower;

public interface FlowerDao {
	List<Flower> selAll();
	int insFlower (Flower flower);
}
