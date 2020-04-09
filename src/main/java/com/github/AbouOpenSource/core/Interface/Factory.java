package com.github.AbouOpenSource.core.Interface;

import com.github.AbouOpenSource.Model.Emetteur;

public interface Factory {
       public Object getInstance(String type);
       public Object getInstance();
}
