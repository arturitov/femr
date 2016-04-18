package femr.ui.models.admin.users;

import femr.common.models.UserItem;
import java.util.List;

public class ManageViewModelGet {
    private int page;
    private int paginationAmount;
    private List<UserItem> users;

    public int getPrevPage(){
        if (page == 1){
            return page;
        }
        return page - 1;
    }
    public int getNextPage(){
        return page + 1;
    }
    public void setPage(int p){
        page = p;
    }

    public int getPaginationAmount() {
        return paginationAmount;
    }

    public void setPaginationAmount(int paginationAmount) {
        this.paginationAmount = paginationAmount;
    }
    public UserItem getUser(int i){
        return users.get(i);
    }

    public void setUsers(List<UserItem> users) {
        this.users = users;
    }

    public List<UserItem> getUsers() {
        return users;
    }

}
