USE [customer]
GO

/****** Object:  Table [dbo].[xss_search_strings]    Script Date: 01/20/2014 08:53:13 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[xss_search_strings](
	[recno] [int] IDENTITY(1,1) NOT NULL,
	[search_string] [varchar](2000) NOT NULL,
	[editeddate] [datetime] NOT NULL,
 CONSTRAINT [PK_xss_search_strings] PRIMARY KEY CLUSTERED 
(
	[recno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON, FILLFACTOR = 85) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO