package com.company;

import java.util.ArrayList;
import java.util.Date;

interface StoragePlace {
StoringItem createItem(String name, Date expiration);
Operation createOperation();

}
