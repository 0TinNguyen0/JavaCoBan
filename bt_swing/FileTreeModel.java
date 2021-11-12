
package bt_swing;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;


public class FileTreeModel implements TreeModel {
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public FileTreeModel(String rootDir) {
        //khởi tạo nút gốc
        rootNode = new DefaultMutableTreeNode (new File (rootDir));
        
        //khởi tại cây
        buildDirectoyTree (rootNode, rootDir);
        tree = new DefaultTreeModel (rootNode);
}
    //Tao cay thu muc
    public void buildDirectoyTree (DefaultMutableTreeNode node,
                                          String rootDir) {
        File curDir = new File (rootDir);
        if (!curDir.isDirectory ()){
        return;
    }
        File[] list = curDir.listFiles ();
        for (int i = 0; i < list.length; i++) {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode (list[1]);
            node.add(child);
            buildDirectoyTree (child, rootDir + File.separator + list[1].getName());
    }
}   


   @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNode;
    }

    @Override
    public Object getChild(Object o, int i) {
        
        return tree.getChild(o, i);
    }

    @Override
    public int getChildCount(Object o) {
        
        return tree.getChildCount(o);
    }

    @Override
    public boolean isLeaf(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.isLeaf(o);
    }

    @Override
    public void valueForPathChanged(TreePath tp, Object o) {
        
        tree.valueForPathChanged(tp, o);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
     
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
}
}