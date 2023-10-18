package com.github.pioneer.ee.tree;

import java.util.List;

/**
 * the base tree node.
 *
 * @Author yixianfeng
 * @Date 2022/10/7 12:44 PM
 */
public abstract class Node {
    /**
     * the children instance
     *
     * @return the children
     */
    public abstract List<? extends Node> children();
}
