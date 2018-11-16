package com.gbm.cesaraguirre.baires;

import java.util.List;

public class Response {
    int totalCount;
    List<Repo> items;

    public int getTotalCount() {
        return totalCount;
    }

    public List<Repo> getItems() {
        return items;
    }
}
