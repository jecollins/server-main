package org.powertac.server;

import org.powertac.common.msg.TariffExpire;

/**
 * TODO: Add Description
 *
 * @author Carsten Block
 * @version 1.0, Date: 06.01.11
 */
public interface ICommandEncodingService {
  public String encodeTariffExpire(TariffExpire cmd);
}
