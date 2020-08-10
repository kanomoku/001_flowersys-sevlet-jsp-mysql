package com.service;

import java.util.List;

import com.pojo.Flower;

public interface FlowerService {
	List<Flower> show();
	int add(Flower flower);
}
