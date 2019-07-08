package com.tao.data.me;

import com.tao.pojo.sys.SimpleMap;

import java.util.List;

public interface AliBillMapperMe {

    SimpleMap getOne(SimpleMap map);

    List<SimpleMap> list(SimpleMap map);
}
