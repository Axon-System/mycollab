/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.view.cases;

import com.esofthead.mycollab.eventmanager.EventBusFactory;
import com.esofthead.mycollab.module.crm.CrmTypeConstants;
import com.esofthead.mycollab.module.crm.events.CaseEvent;
import com.esofthead.mycollab.module.crm.i18n.CaseI18nEnum;
import com.esofthead.mycollab.module.crm.ui.CrmAssetsManager;
import com.esofthead.mycollab.module.crm.ui.components.CrmListNoItemView;
import com.esofthead.mycollab.security.RolePermissionCollections;
import com.esofthead.mycollab.vaadin.AppContext;
import com.esofthead.mycollab.vaadin.mvp.ViewComponent;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author MyCollab Ltd.
 * @since 4.0
 */
@ViewComponent
public class CaseCrmListNoItemView extends CrmListNoItemView {
    private static final long serialVersionUID = 1L;

    @Override
    protected FontAwesome titleIcon() {
        return CrmAssetsManager.getAsset(CrmTypeConstants.CASE);
    }

    @Override
    protected String titleMessage() {
        return AppContext.getMessage(CaseI18nEnum.VIEW_NO_ITEM_TITLE);
    }

    @Override
    protected String hintMessage() {
        return AppContext.getMessage(CaseI18nEnum.VIEW_NO_ITEM_HINT);
    }

    @Override
    protected String actionMessage() {
        return AppContext.getMessage(CaseI18nEnum.BUTTON_NEW_CASE);
    }

    @Override
    protected Button.ClickListener actionListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent clickEvent) {
                EventBusFactory.getInstance().post(
                        new CaseEvent.GotoAdd(this, null));
            }
        };
    }

    @Override
    protected boolean hasPermission() {
        return AppContext.canWrite(RolePermissionCollections.CRM_CASE);
    }
}