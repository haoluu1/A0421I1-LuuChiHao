package codegym.service;

import codegym.model.Declaration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeclarationService implements IDeclarationService{
    Map<Integer, Declaration> map= new HashMap<>();
    @Override
    public List<Declaration> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Declaration findById(int id) {
        return map.get(id);
    }

    @Override
    public void save(Declaration declaration) {
        map.put(declaration.getId(),declaration);
    }

    @Override
    public void remove(int id) {
        map.remove(id);
    }
}
