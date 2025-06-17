package com.petshopmalucao.service;

import com.petshopmalucao.entity.Produto;
import com.petshopmalucao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto save(Produto produto) {
        if (produtoRepository.findByNomeIgnoreCase(produto.getNome()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Produto com este nome já existe.");
        }
        return produtoRepository.save(produto);
    }

    public Produto update(Long id, Produto produtoDetails) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado com ID: " + id));

        if (!produto.getNome().equalsIgnoreCase(produtoDetails.getNome()) && produtoRepository.findByNomeIgnoreCase(produtoDetails.getNome()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Produto com este nome já existe para outro ID.");
        }

        produto.setNome(produtoDetails.getNome());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPreco(produtoDetails.getPreco());
        produto.setQuantidadeEstoque(produtoDetails.getQuantidadeEstoque());
        return produtoRepository.save(produto);
    }

    public void deleteById(Long id) {
        if (!produtoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado com ID: " + id);
        }
        produtoRepository.deleteById(id);
    }
}