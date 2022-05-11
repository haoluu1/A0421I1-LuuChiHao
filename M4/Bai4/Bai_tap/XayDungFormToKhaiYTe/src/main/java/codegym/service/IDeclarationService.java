package codegym.service;

import codegym.model.Declaration;

import java.util.List;

public interface IDeclarationService {
    List<Declaration> findAll();
    Declaration findById(int id);
    void save(Declaration declaration);
    void remove(int id);
}
