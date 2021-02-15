package com.kata.bank;

import java.util.List;

public class Statement {
    private List<StatementLine> lines;

    public Statement(List<StatementLine> lines) {
        this.lines = lines;
    }

    public List<StatementLine> getLines() {
        return lines;
    }
}
