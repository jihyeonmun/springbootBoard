package com.example.demo.ifs;

import com.example.demo.model.Header;

public interface Crudinterface<Req,Res>{

    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}
