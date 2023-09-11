# Aula 1

- Comparator objeto de classe separada
- Comparator objeto de classe anônima
- Comparator objeto de expressão lambda
- Comparator objeto de expressão lambda sem chaves
- Comparator expressão lambda "direto no argumento"

# Aula 2

## O que são "expressões Lambda"?

Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe.

|  | Programação Imperativa               | Programação Funcional |   |   |
|---|---|---|---|---|
| Como se descreve algo a ser computado (*)  |  comandos ("como" - imperativa)  | expressões ("o quê" - declarativa)  |
| Funções possuem transparência referencial
(ausência de efeitos colaterais)  | fraco  | forte  |
| Funções são objetos de primeira ordem  | não  | sim  |
| Expressividade / código conciso               |   baixa     | alta |
| Tipagem dinâmica / inferência de tipos | raro  |  comum  |

* Cálculo Lambda = formalismo matemático base da programação funcional
* Expressão lambda = função anônima de primeira classe

# Aula 3
É uma interface que possui um único método abstrato. Suas
implementações serão tratadas como expressões lambda.

## Exemplos de interfaces funcionais

`public class MyComparator implements Comparator<Product> {
@Override
public int compare(Product p1, Product p2) {
return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
}
}`

```
public static void main(String[] args) {
(...)
list.sort(new MyComparator());
```

- Predicate
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

- Function
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html

- Consumer
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
    - Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é
esperado ele possa gerar efeitos colaterais

### Predicate

https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html

1- Implementação da interface

```
public interface Predicate<T> {
    boolean test (T t);
}
```

2- Reference Method - faz um método estático dentro da classe e chama no programa principal

`
public static boolean staticProductPredicate(Product p) {
	return p.getPrice() >= 100.0;
}
`
`
list.removeIf
(Product::staticProductPredicate);
`

3- Reference Method - método não estático dentro da classe e chama no programa principal

`
public boolean nonStaticProductPredicate() {
	return this.getPrice() >= 100.0;
}
`
`
list.removeIf(Product::nonStaticProductPredicate);
`

4- Expressão lamda declarada - dentro do programa principal

```
double mim = 100.0;

Predicate<Product> predicate = p -> p.getPrice() >= mim;

list.removeIf(predicate);
```

5- Expressão lambda inline

```
double mim = 100.0;

list.removeIf(p -> p.getPrice() >= mim);
```