/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class CampaignWithBLOBs extends Campaign {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaign.objective
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("objective")
    private String objective;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaign.description
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaign.objective
     *
     * @return the value of m_crm_campaign.objective
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    public String getObjective() {
        return objective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaign.objective
     *
     * @param objective the value for m_crm_campaign.objective
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaign.description
     *
     * @return the value of m_crm_campaign.description
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaign.description
     *
     * @param description the value for m_crm_campaign.description
     *
     * @mbggenerated Mon Dec 07 11:25:09 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        campaignname,
        startdate,
        enddate,
        currencyid,
        impressionnote,
        budget,
        actualcost,
        expectedrevenue,
        expectedcost,
        impression,
        createdtime,
        createduser,
        saccountid,
        status,
        type,
        assignuser,
        lastupdatedtime,
        avatarid,
        objective,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}