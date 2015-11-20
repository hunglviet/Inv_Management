/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv_management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lvhung
 */
@Entity
@Table(name = "TB_APPMENU", catalog = "", schema = "LVHUNG")
@NamedQueries({
    @NamedQuery(name = "TbAppmenu.findAll", query = "SELECT t FROM TbAppmenu t"),
    @NamedQuery(name = "TbAppmenu.findById", query = "SELECT t FROM TbAppmenu t WHERE t.id = :id"),
    @NamedQuery(name = "TbAppmenu.findByMenu", query = "SELECT t FROM TbAppmenu t WHERE t.menu = :menu"),
    @NamedQuery(name = "TbAppmenu.findBySubmenu", query = "SELECT t FROM TbAppmenu t WHERE t.submenu = :submenu"),
    @NamedQuery(name = "TbAppmenu.findByFormname", query = "SELECT t FROM TbAppmenu t WHERE t.formname = :formname")})
public class TbAppmenu implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MENU")
    private String menu;
    @Column(name = "SUBMENU")
    private String submenu;
    @Column(name = "FORMNAME")
    private String formname;

    public TbAppmenu() {
    }

    public TbAppmenu(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        String oldMenu = this.menu;
        this.menu = menu;
        changeSupport.firePropertyChange("menu", oldMenu, menu);
    }

    public String getSubmenu() {
        return submenu;
    }

    public void setSubmenu(String submenu) {
        String oldSubmenu = this.submenu;
        this.submenu = submenu;
        changeSupport.firePropertyChange("submenu", oldSubmenu, submenu);
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        String oldFormname = this.formname;
        this.formname = formname;
        changeSupport.firePropertyChange("formname", oldFormname, formname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAppmenu)) {
            return false;
        }
        TbAppmenu other = (TbAppmenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inv_management.TbAppmenu[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
